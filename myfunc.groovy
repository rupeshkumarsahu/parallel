// myFunctions.groovy

echo 'Hello! World'
// myfunc.groovy

return [
    greet: { name -> "Hello, ${name}!" },
    add: { a, b -> a + b }
]
