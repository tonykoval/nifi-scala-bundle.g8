#nifi-scala-bundle.g8

A [gitter8](http://www.foundweekends.org/giter8/) template for generating a new Scala NiFi processor bundle using sbt plugin [sbt-nifi-nar](https://github.com/tonykoval/sbt-nifi-nar)

### Basic usage

```
$ sbt new tonykoval/nifi-scala-bundle.g8
$ cd <name-of-app>
$ sbt generateDocProcessors narArchive
```

### Variables
```
name=nifi-example-bundle
organization=com.example
version=0.1-SNAPSHOT
classname=ExampleProcessor
nifi_version=1.11.4
scala_version=2.12.12
```

### License

Except as otherwise noted this software is licensed under the
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.