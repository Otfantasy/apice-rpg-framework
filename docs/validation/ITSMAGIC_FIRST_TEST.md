# ITsMagic First Test

## Goal

Validate, inside the ITsMagic editor, which script format should be adopted for the rest of the project:

- External repository file with `class Name extends Component`
- Direct editor paste without class declaration

## Test Setup

1. Open ITsMagic.
2. Create a new empty project.
3. Create an empty object in the scene.
4. Keep this repository open for reference while testing.

## Test 1: External File Format

Use [scripts/validation/ExternalClassValidation.java](/C:/Users/claud/Documents/JOGO/scripts/validation/ExternalClassValidation.java).

Steps:

1. Create or import a script/component in the project using the external file format.
2. Use the full repository version exactly as written:

```java
class ExternalClassValidation extends Component {
    String validationState;

    void start() {
        validationState = "EXTERNAL_CLASS_OK";
    }
}
```

3. Attach the component to the empty object.
4. Try compiling or saving according to the editor workflow.

What to record:

- Whether `Component` is recognized automatically
- Whether the class wrapper is accepted
- Whether `start()` is accepted
- Any compile, parse, or attach errors

## Test 2: Direct Editor Paste Format

Use [scripts/validation/EditorPasteValidation.java](/C:/Users/claud/Documents/JOGO/scripts/validation/EditorPasteValidation.java).

Steps:

1. Create a new script/component directly in the ITsMagic editor.
2. Paste only the script body:

```java
String validationState;

void start() {
    validationState = "EDITOR_PASTE_OK";
}
```

3. Save or compile the script.
4. Attach it to the same empty object or to a second empty object for isolation.

What to record:

- Whether the editor auto-wraps the script as a component
- Whether the body-only format is accepted
- Any compile or parsing error
- Any difference compared with the external class format

## Error Registration

For each failed attempt, record:

- Test name
- Script format used
- Exact editor error message
- Whether the failure happened on create, paste, compile, attach, or run
- Screenshot or copied log text if available

## Decision Rule

At the end of the test, confirm one of these outcomes:

1. External class format is accepted and will remain the project standard.
2. Editor paste format is required and repository files must be adapted before further implementation.
3. Both formats work, and the repository can keep the external format while documenting the editor-paste alternative.

## Important Constraint

Do not continue to implement `UIManager`, `InventoryManager`, `GuardianManager`, or any other gameplay system before this format test is completed and the project standard is confirmed.
