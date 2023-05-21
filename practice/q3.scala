def checkThirty(a: Int, b: Int): Boolean = {
  (a == 30 || b == 30) || (a + b == 30)
}

// Test cases
println(checkThirty(20, 10))   // Output: false
println(checkThirty(30, 5))    // Output: true
println(checkThirty(15, 15))   // Output: true
println(checkThirty(20, 11))   // Output: false
println(checkThirty(0, 30))    // Output: true
