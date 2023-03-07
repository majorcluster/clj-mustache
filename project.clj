(defproject clj-mustache "0.0.1-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "{{ mustache }} for Clojure"
  :url "http://github.com/mtsbarbosa/clj-mustache"
  :license {:name "GNU Lesser General Public License 2.1"
            :url "http://www.gnu.org/licenses/lgpl-2.1.txt"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :profiles {:dev {:dependencies [[org.clojure/data.json "2.4.0"]
                                  [jline/jline "3.0.0.M1"]]
                   :resource-paths ["test-resources"]}}
  :repositories [["clojars" {:url "https://repo.clojars.org/"}]
                 ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :aliases {"all" ["with-profile" "dev:dev"]}
  :global-vars {*warn-on-reflection* true})
