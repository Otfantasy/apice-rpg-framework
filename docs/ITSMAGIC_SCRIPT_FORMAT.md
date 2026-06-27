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

## Format Used In This Repository

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

## Format Potentially Used When Pasting Into The ITsMagic Editor

The task context states that ITsMagic can automatically declare the script as a component in the editor workflow. In that case, the pasted body may look like this:

```java
String frameworkState;

void start() {
    frameworkState = "BOOTSTRAP";
}
```

## Practical Rule

- Keep `class Name extends Component` in repository files.
- If the ITsMagic editor auto-wraps component classes, paste only the inner body.
- If the editor expects full Java class syntax, paste the repository version unchanged.

## Review Conclusion

The current repository format is acceptable for external source control.

What still needs real validation in the engine:

- Whether the editor accepts the wrapped class form directly.
- Whether the editor prefers only the inner script body for pasted components.
- Whether any project-specific script folder conventions must be followed.
