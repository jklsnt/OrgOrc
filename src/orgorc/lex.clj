(ns orgorc.lex
  (:gen-class))

(def test-file (slurp "./resources/test.org"))

`(parse
  test-file
  (token DRAWER
         (:activate (\: (next (not \space)
                              (not \:))))
         (:deactivate (\: (next \space
                                \newline)))
         (:options :start-first))
  (token FLAG
         (:activate (\# (next \+)))
         (:deactivate (\: (next\space))
                      (\newline))))

(defn parse-fense
  "Parse a fense statement like (:activate)"

  [expr]
  (let [operator (first expr)
        content (rest expr)]
    content))

(parse-fense '(:activate
               (\: (next (not \space)
                         (not \:)))))


