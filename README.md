Kotlin Demo
===========

This repo contains some small code examples used in the Kotlin talk of @albertoruibal at @VigoJUG.

The slides are at https://docs.google.com/presentation/d/1K-jqOlRYFvMRJmJZuQYVp3lhH70gvfoiaWa8MzqGe9A/edit?usp=sharing

* demo: live demo and examples of code conversion
* coroutines: example of coroutine usage
* node-js-express: an example of a node.js express app developed with kotlin, based on this Miquel Betltran blog post: https://medium.com/@Miqubel/your-first-node-js-app-with-kotlin-30e07baa0bf7

Tre projects "demo" and "coroutines" can be run directly from IntelliJ.

To run the "node-js-express" example, with node.js and gradle installed do in the node-js-express directory:
```
npm install
gradle build
node ./build/classes/main/kotlin-js-express_main.js
```
