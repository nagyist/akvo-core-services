(defproject akvo-auth "0.1.0-SNAPSHOT"
  :description "Akvo authentication and authorisation service"
  :url "http://www.akvo.org/"
  :license {:name "GNU Affero General Public License"
            :url "http://www.gnu.org/licenses/agpl.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.memoize "0.5.4"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.3"]
                 [http-kit "2.1.4"]
                 [com.cemerick/friend "0.1.5"]]
  :main akvo-auth.core)
