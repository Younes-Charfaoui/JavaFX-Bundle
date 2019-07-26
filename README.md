# JavaFX Bundle
[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com) 
![](https://img.shields.io/badge/lisence-MIT-blue) ![](https://img.shields.io/badge/version-1.0.0-green)

![Logo Image](https://github.com/Younes-Charfaoui/JavaFX-Bundle/blob/master/logos/logo_bundles.png)

**JavaFX Bundle** is Mini-Library that helps you pass parameters and objects between the controllers in your JavaFX application without using static parameters and other old techniques.

## Getting Started

Follow this instructions to start using the library in your JavaFX projects.

### Prerequisites

You will need just a running machine with JDK installed and a simple IDE that let you import your JAR files. 

### Installing

Go under the [release ](https://github.com/Younes-Charfaoui/JavaFX-Bundle/releases) section and download the latest library in JAR file format, 
then throughout your IDE (I prefer IntelliJ IDEA) add the JAR file to the project. 

Now you can have fun with your objects passed everywhere in your JavaFX Application. 

## Usage

#### 1- Create Bundle Object

In order to pass some parameters you need to create an object called `FXBundle`, this on object will be passed between the controllers,
to create this object you have two options:
##### 1- The Builder Way:
You can use the Builder Object of this FXBundle and then use this builder to 

````java
// create new Builder instance.
FXBundle.Builder bundleBuilder = new FXBundle.Builder();
// build the object.
FXBundle bundle = bundleBuilder.build();
````

##### 1- The Map Way:
another way to create the FXBundle Object is throught a constructor that accept a map of type String => Object 

````java
// create a simple hash map.
Map<String, Object> map = new HashMap<>();
// create an instance with this map.
FXBundle bundle = new FXBundle(map);
````

#### 2- Fill out the Bundle


#### 3- Pass the Bundle

#### 4- Extends the FXBundleController 


## Authors

* **Younes Charfaoui** - *Initial work* - [Younes Charfaoui](https://github.com/Younes-Charfaoui)
*  **Houari Zegai** - *Testing* - [Houari Zegai](https://github.com/HouariZegai)

See also the list of [contributors](https://github.com/Younes-Charfaoui/JavaFX-Bundle/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details