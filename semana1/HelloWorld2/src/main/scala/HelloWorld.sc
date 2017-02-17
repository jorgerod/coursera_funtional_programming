def example = 2      // evaluated when called
println(example)

val example2 = 2      // evaluated immediately
println(example2)

lazy val example3 = 2 // evaluated once when needed
println(example3)

