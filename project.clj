(defproject dactyl-keyboard "0.1.0-SNAPSHOT"
  :description "A parametrized, split-hand, concave, columnar, erogonomic keyboard"
  :url "http://example.com/FIXME"
  :main dactyl-keyboard.dactyl
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-auto "0.1.3"]
            [lein-exec "0.3.7"]
            [lein-cljfmt "0.9.2"]
           ]
  :aliases {"generate" ["exec" "-p" "src/dactyl_keyboard/dactyl.clj"]}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [scad-tarmi "0.8.1"]
                 [scad-clj "0.5.3"]
                 [scad-klupe "0.3.0"]
                 ])


