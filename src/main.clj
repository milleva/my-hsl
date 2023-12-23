(ns main)

(defn run [_opts]
  (let [[arg1 arg2 arg3] *command-line-args*]
    (prn "starting evans hsl app" arg1 (keyword arg2) arg3)))