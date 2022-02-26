(ns orgorc.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (slurp "./resources/test.org")
  (println "Hello, World!"))
