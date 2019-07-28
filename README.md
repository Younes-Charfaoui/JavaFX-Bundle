# JavaFX Bundle
[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com) 
![](https://img.shields.io/badge/lisence-MIT-blue) ![](https://img.shields.io/badge/version-1.0.0-green)

![Logo Image](https://github.com/Younes-Charfaoui/JavaFX-Bundle/blob/master/logos/logo_bundles.png)

**JavaFX Bundle** is Mini-Library that helps you pass parameters and objects between the controllers in your JavaFX application without using static parameters and other old techniques.

## Getting Started

Follow these instructions to start using the library in your JavaFX projects.

### Prerequisites

You will need just a running machine with JDK installed and a simple IDE that let you import your JAR files. 

### Installing

Go under the [release](https://github.com/Younes-Charfaoui/JavaFX-Bundle/releases) section and download the latest library in JAR file format, 
then throughout your IDE (I prefer IntelliJ IDEA) add the JAR file to the project. 

Now you can have fun with your objects passed everywhere in your JavaFX Application. 

## Usage

#### 1- Create Bundle Object

To pass some parameters you need to create an object named `FXBundle`, this object will be transferred between the controllers,
to create this object you have two options:

##### 1- The Builder Way:
You can use the Builder Object of this FXBundle and next use this builder to  populate this bundle with any parameters

````java
// create new Builder instance.
FXBundle.Builder bundleBuilder = new FXBundle.Builder();
// build the object.
FXBundle bundle = bundleBuilder.build();
````

##### 1- The Map Way:
Another way to build the FXBundle Object is throughout a constructor that receives a map of type String => Object 

````java
// create a simple hash map.
Map<String, Object> map = new HashMap<>();
// create an instance with this map.
FXBundle bundle = new FXBundle(map);
````

#### 2- Fill out the Bundle
You can fill out the bundle object from the map passed by the default `put` function like the following:

````java
// create a simple hash map.
Map<String, Object> map = new HashMap<>();
map.put("username", "younes");
map.put("password", "12345678abcd");
map.put("id", 12);
// create an instance with this map.
FXBundle bundle = new FXBundle(map);
````

Or throughout the Builder object using the `putExtra` function that let you pass any sort of object like the following:

````java
FXBundle bundle = new FXBundle.Builder()
                .putExtra("username", "hi")
                .putExtra("password", "12345678abcd")
                .putExtra("id", 3)
                .build();
````

#### 3- Pass the Bundle
In the pre-final step, you can directly pass this object in the 2nd parameter of the `load` 
function from the `FXMLLoader` like this:

```java
FXBundle bundle = new FXBundle.Builder()
                .putExtra("username", "younes")
                .putExtra("id", 3)
                .build();
Pane pane = FXMLLoader.load(..., bundle);
```

#### 4 - Get back your passed things
The controller that you are passing to it the bundle should implement the `Initializable` interface,
at that stage, inside the `initialize` method implemented by the last interface, you have to cast the second parameter which is of type `ResourceBundle` into our `FXBundle`, here is an example:

```java

public void initialize(URL location, ResourceBundle resources) {
        FXBundle bundle = (FXBundle) resources;
        String userName = bundle.getStringExtra("username");
        // do what ever you want with the received params. 
}
```

After you got your passed bundle, you can take back your parameters with getters of the `FXBundle` class. 
 
#### 5- Extends the FXBundleController (Optional) 
We could make the same thing with extending another class which Called `FXBundleController` in which you gonna
implement a method called  `initializeController` in which you will get a fresh FXBundle you just passed. 

```java
public class Controller extends FXBundleController {

    public void initializeController(URL location, FXBundle bundle) {
        String userName = bundle.getStringExtra("username");
        // do what ever you want with the received params.
    }
}
```

## Authors

* **Younes Charfaoui** - *Initial work* - [Younes Charfaoui](https://github.com/Younes-Charfaoui)

See also the list of [contributors](https://github.com/Younes-Charfaoui/JavaFX-Bundle/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details