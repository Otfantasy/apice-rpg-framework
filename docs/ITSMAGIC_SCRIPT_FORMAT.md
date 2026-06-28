# ITsMagic Script Format

## Purpose

This document separates two different representations of the same component idea:

- External repository files stored as `.java`
- Code pasted directly into the ITsMagic editor

## Confirmed Baseline

The official Java API documents engine components as Java classes that extend `Component`, and the `Component` API exposes lifecycle methods such as `start()` and `repeat()`.

References:

- [Component API](https://itsmagic.com.br/documentation/docs/java/Components/Component/)
- [Laser example using `repeat()`](https://itsmagic.com.br/documentation/docs/topics/laser/UsingLaserAndLaserHit/)

## Manual Validation Status

Both formats below were validated manually inside ITsMagic on 2026-06-27.

- The wrapped repository class format worked.
- The direct editor-paste body format also worked.
- No validation error was reported in either case.

## Official Repository Format

For versioned source files kept outside the engine editor, this repository uses the explicit wrapper:

```java
class GameManager extends Component {
    String frameworkState;

    void start() {
        frameworkState = "BOOTSTRAP";
    }
}
```

Why this format is used:

- It keeps each script self-contained in source control.
- It matches the Java API style shown in the official documentation.
- It is the safest external-file representation when the repository is not embedded directly inside the editor.

Repository standard:

- Use `class Name extends Component` as the primary format for framework files.

## Alternate Format For Direct Editor Paste

When a script is pasted directly into the ITsMagic editor, the body-only format may look like this:

```java
String frameworkState;

void start() {
    frameworkState = "BOOTSTRAP";
}
```

## Practical Rule

- Keep `class Name extends Component` in repository files.
- If the ITsMagic editor auto-wraps component classes, paste only the inner body when needed.
- If the editor expects full Java class syntax, paste the repository version unchanged.

## Current Conclusion

- The official repository format is `class Name extends Component`.
- The alternate direct-paste format without class declaration is also valid.
- Both formats were validated manually in ITsMagic.
- The framework will continue to use the class-based format for organization and versioning.
