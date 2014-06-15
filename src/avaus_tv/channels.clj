(ns avaus-tv.channels
  "Channel related data - channel IDs and prizes.")

(def channels
  "The channel IDs."
  [:sports :movies :gossip :kids])

(def prizes
  "Map of channels to prizes."
  {:sports :free-sporting-event-tickets
   :movies :free-movie-tickets
   :gossip :free-movie-tickets
   :kids   nil})
