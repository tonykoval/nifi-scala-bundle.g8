# $name$

A nifi bundle with custom processors created from a giter8 template [tonykoval/nifi-scala-bundle.g8](https://github.com/tonykoval/tonykoval/nifi-scala-bundle.g8)

### Documentation
To generate documentation of processors (using `sbt-nifi-nar` [plugin](https://github.com/tonykoval/sbt-nifi-nar)), folder `docs\index.html` run
 
    sbt generateDocProcessors

### Nar archive
To create nar archive (using `sbt-nifi-nar` [plugin](https://github.com/tonykoval/sbt-nifi-nar)), `$name$-(version).nar`, run

    sbt narArchive

### Test
To test `$name$`, run

    sbt test

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
