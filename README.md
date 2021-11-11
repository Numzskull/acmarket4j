# acmarket4j
An unofficial Java wrapper for anticheat.market

## Usage
Using acmarket4j is relatively simple, and only requires a few steps to get it up and running.

First we must initialize our ACMarket instance with any provided data.

```java
final ACMarket acMarket = new ACMarket(null);
```

Fetching data is just as easy.

To fetch a resource, you can do

```java
final Resource resource = acMarket.getResource("resourceId");
```

To fetch a profile, you can do

```java
final Profile profile = acMarket.getProfile(id);
```