(ns request-stuff.routes
    (:use compojure.core
      request-stuff.views
      [hiccup.middleware :only (wrap-base-url)])
    (:require [compojure.route :as route]
      [compojure.handler :as handler]))

(defroutes main-routes
           (GET "/" [] (index-page))
           (route/resources "/")
           (route/not-found "Page not found"))

(def app
  (-> (handler/site main-routes)
      (wrap-base-url)))