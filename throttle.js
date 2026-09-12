const url = "https://dummyjson.com/products/1";

async function fetchData(url) {
  try {
    const response = await fetch(url);
    const data = await response.json();
    if (data) {
      console.log("Successfully received data from remote server!");
    }
  } catch (err) {
    console.log("Error: " + err);
  }
}

function fetchWithThrottle(fn, delay) {
  let lastCall = 0;

  return function (...args) {
    let currentCall = Date.now();
    if (currentCall - lastCall >= delay) {
      fn.apply(this, args);
      lastCall = currentCall;
      return "success";
    }
    return "failed";
  };
}

const throttledSearch = fetchWithThrottle(fetchData, 5000);

let firstAttempt = throttledSearch(url);
let secondAttempt = throttledSearch(url);
let thirdAttempt = throttledSearch(url);
let fourthAttempt = throttledSearch(url);
let fifthAttempt = throttledSearch(url);

console.log("First attempt: " + firstAttempt);
console.log("Second attempt: " + secondAttempt);
console.log("Third attempt: " + thirdAttempt);
console.log("Fourth attempt: " + fourthAttempt);
console.log("Fifth attempt: " + fifthAttempt);

/**
 * output:
First attempt: success
Second attempt: failed
Third attempt: failed
Fourth attempt: failed
Fifth attempt: failed
Successfully received data from remote server!
 */
