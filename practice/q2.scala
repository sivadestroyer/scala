def absoluteDifference(n: Int): Int = {
  val diff = Math.abs(n - 51)
  if (n > 51) {
    3 * diff
  } else {
    diff
  }
}

// Test cases
println(absoluteDifference(47))  // Output: 4
println(absoluteDifference(51))  // Output: 0
println(absoluteDifference(55))  // Output: 12 (3 * (55 - 51))
