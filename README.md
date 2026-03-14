# SmartShift Roster Management System

A cloud-based employee roster management system developed using Spring Boot and a custom scheduling engine library.

## Project Structure

smartshift
│
├── smartshift-backend
│   └── Spring Boot REST API
│
├── roster-engine
│   └── Custom Java library for roster validation
│
├── build.gradle
└── settings.gradle

## Features

- Employee management
- Shift scheduling
- Shift conflict detection
- Weekly roster queries
- Custom scheduling rule engine

## Technologies

- Java
- Spring Boot
- Gradle (multi-module)
- PostgreSQL
- AWS (planned deployment)

## Custom Library

The project includes a separate Gradle module **roster-engine** which provides:

- Shift overlap detection
- Shift time validation
- Weekly hour calculation

This module is reused by the backend service layer.

## Author

Choijoo