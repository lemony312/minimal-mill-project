# Minimal Mill Project

A simple Scala project using Mill build tool with common dependencies for testing Scala Steward.

## Dependencies
- upickle: JSON serialization
- requests: HTTP client

## Build
```bash
./mill core.compile
./mill core.test
./mill core.run
```

## Scala Steward
This project includes a GitHub Action workflow to test Scala Steward dependency updates.