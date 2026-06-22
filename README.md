# sample-java-job-decorator

Showing how to use `@Scheduled` to register a Quartz job in
[Eclipse Dirigible](https://www.dirigible.io/).

## Layout

```
sample-java-job-decorator/   # Dirigible project (registry path)
└── demo/
    └── scheduled/
        └── CleanupJob.java  # @Scheduled — fires every second, logs "CleanupJob executed!"
```

## Usage

Drop this project into the Dirigible IDE (clone via the Git perspective and publish, or copy it
to `/registry/public/sample-java-job-decorator/`). The synchronizer compiles `CleanupJob.java`,
registers the Quartz job, and it starts firing on the declared cron expression immediately.

## Job styles

Two ways to write a Java job — pick one per `@Component` class (never both), like Spring:

- **Strong interface** — `CleanupJob` is a `@Component` that implements `JobHandler` and supplies its own `cron()` (like `org.quartz.Job`); no `@Scheduled` annotation.
- **Method-level annotation** — `Maintenance` is a `@Component` with `@Scheduled`-annotated methods (Spring `@Scheduled`-on-a-method style).

See the [Develop guide](https://www.dirigible.io/help/develop/scheduled-jobs/) and the [Java SDK](https://www.dirigible.io/sdk/).
