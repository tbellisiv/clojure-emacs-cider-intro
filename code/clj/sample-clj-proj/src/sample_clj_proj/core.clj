(ns sample-clj-proj.core
  (:gen-class))

(defn say-hello
  "Prints a hello message. With no args, prints 'Hello!'. With one args prints 'Hello <arg>!. With two args prints 'Hello <arg1> from <arg>2!"
  ([] (println "Hello!"))
  ([to] (println (format  "Hello, %s!" to)))
  ([to from] (println (format "Hello, %s from %s!" to from))))

(defn -main
  "Main entrypoint"
  [& args]
  (say-hello "EmacsATX" "Tellis"))

