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
