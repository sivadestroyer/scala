def findLargerValue(a: Int, b: Int): Int = {
  if (a >= 20 && a <= 30 && b >= 20 && b <= 30) {
    if (a > b) a else b
  } else if (a >= 20 && a <= 30) {
    a
  } else if (b >= 20 && b <= 30) {
    b
  } else {
    0
  }
}

// Test cases
println(findLargerValue(25, 28))    // Output: 28
println(findLargerValue(21, 25))    // Output: 25
println(findLargerValue(15, 18))    // Output: 0
println(findLargerValue(31, 35))    // Output: 0
