# Welcome!

Hi teachers! This repo contains all our JMH benchmarking.

- `Main.java` is a placeholder - it doesn't particularly do anything.
- All our "coding" files are in `src/main/java/bench`.
- To compile the code, run `mvn -DskipTests package` (note: you need to have Maven installed)
- To run the code, use `java -jar target/benching-1.0-SNAPSHOT-bench.jar -prof gc`
- If you don't have Maven installed, you can also use the provided `BENCH.jar` file in the root folder after downloading the project