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

- **Reflective** — `CleanupJob` (a `@Scheduled` class with a `run()` method by name).
- **Strong interface** — `ReportJob implements JobHandler` (compile-checked `run()`).
- **Method-level annotation** — `Maintenance`, a `@Component` bean with `@Scheduled`-annotated methods (Spring style).

See the [Develop guide](https://www.dirigible.io/help/develop/scheduled-jobs/) and the [Java SDK](https://www.dirigible.io/sdk/).
