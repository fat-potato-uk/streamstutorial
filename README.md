### Challenge 8

This tutorial is focused around use of Java streams. If you run the tests you will see they all currently
fail. You must update the `StreamsChallenge` class so all the unit tests pass! There are answers in
`StreamsChallengeAnswers`, but try and attempt the exercise without peeking!

That's all!

##### Hints

* Streams are most analogous to Unix pipes, e.g. `find . -name "*.txt" | xargs grep -i sometext`
whereby one operation feeds (streams) into the next, therefore, _collection.stream()_ will 
iterate over the collection and return a _stream_ of values that can then be processed.

* _collection.stream().action(item -> someFunction(item)) is the typical pattern found
for streams behaviour, where action takes some sort of lambda function. Examples of this include: 
    * _collection.stream().filter(x -> x.startsWith(...)_ will filter on the lambda function boolean outcome
    * _collection.stream().sort()_ will sort the collection
    * _collection.stream().action(...).collect(toList())_ will collate the output to a list
    (other collection types may even exist...)
    * _collection.stream().map(x -> return x)_ will perform an action then return the result
    * _collection.stream().reduce((x1, x2) -> x1+x2)_ will reduce the contents of the collection
    based on the function provided (this example would sum all the values if x was an int)

* Google is your friend when it comes to Streams!