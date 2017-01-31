# Evaluating Code in the REPL

Now that we have a REPL session, let's evaluate some Clojure code.

## Clojure Expressions

#### 1.4 times 67 
Enter`(* 1.4 67)`

![REPL Screenshot - 1.4 * 67](images/repl_expr_mult.jpg)

#### Print "Hello, world!"
Enter `(println "Hello, world!")`

![REPL Screenshot - Hello, world!](images/repl_hello_world.jpg)

#### Sort a Vector (Array) of Numbers
Enter `(sort [4.2 10 1 4.5 1 15])`

![REPL Screenshot - Vector Sort](images/repl_expr_sort.jpg)

#### Sum a Vector of Numbers
Enter `(reduce + [4.2 10 1 4.5 1 15])`

![REPL Screenshot - Sum](images/repl_expr_reduce.jpg)

### Increment a Vector of Numbers
Enter `(map inc [4.2 10 1 4.5 1 15])`

![REPL Screenshot - Sum](images/repl_expr_map.jpg)


## Variables

### Using Variables (a.k.a. "var")

Define a "var" with string content:

`(def my-string-var "Hello, world")`

Display the value of the var:

`my-string-var`

Display the length of the string

`(count my-string-var)`

**Output**
![REPL Screenshot - Using Vars](images/repl_var_use.jpg)


## Collections

### Vectors

Define a var with vector content:

`(def valid-states [:stopped :stopping :running])`

Add elements to the vector:

`(conj valid-states :starting :paused)`

Return the third element of the vector:

`(get valid-states 2)`

**Output**
![REPL Screenshot - Using Vectors](images/repl_coll_vector.jpg)




### Maps

### Sets

### Lists




