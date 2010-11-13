(ns sicp
  (:require clojure.square)
)

(defn check-against-number [number_to_check current_divisor]
  (println (mod number_to_check current_divisor))
  (if (= 0 (mod number_to_check current_divisor))
    1
    0
  )
)

(defn prime-test [number_to_check current_divisor]
	(if (> current_divisor (square number_to_check))
		(println "prime")
		(if (= 1 (check-against-number number_to_check current_divisor))
		  (println "not prime")
		  (prime-test number_to_check (+ 1.0 current_divisor))
		)
	)
)

(defn prime-check [number_to_check]
  (print "checking whether ")
  (print number_to_check)
  (println " is prime")
  (prime-test number_to_check 2.0)
)

(prime-check 1151)

(prime-check 1729)

(prime-check 561)
