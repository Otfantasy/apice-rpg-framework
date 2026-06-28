# Validation Checklist

## Goal

Validate that the current placeholder scripts can be imported into ITsMagic without introducing undocumented APIs or unsupported formatting.

## Latest Result

Manual validation completed on 2026-06-27.

- `EditorPasteValidation.java`: compiled, saved, stayed attached to the object, and ran without errors.
- `ExternalClassValidation.java`: compiled, saved, stayed attached to the object, and ran without errors.
- No compiler, parser, attach, or runtime error message appeared during the validation.
- Repository decision: keep `class Name extends Component` as the primary framework standard.
- Alternate note: direct editor paste without class declaration also works, but remains a secondary workflow.

## Before Testing

1. Start with a clean ITsMagic test project.
2. Keep a copy of this repository available for side-by-side comparison.
3. Read [ITSMAGIC_SCRIPT_FORMAT.md](/C:/Users/claud/Documents/JOGO/docs/ITSMAGIC_SCRIPT_FORMAT.md) before copying any script.

## Recommended Test Order

1. `scripts/core/GameManager.java`
2. `scripts/ui/UIManager.java`
3. `scripts/gameplay/PlayerManager.java`
4. `scripts/gameplay/GuardianManager.java`
5. `scripts/gameplay/InventoryManager.java`
6. Remaining gameplay managers
7. Online managers
8. Database placeholders

## How To Import Or Copy Scripts

1. Try the repository file format first: `class Name extends Component { ... }`.
2. If the editor rejects the wrapper, convert to the inner-body format documented in `docs/ITSMAGIC_SCRIPT_FORMAT.md`.
3. Import only one new script at a time during the first validation pass.
4. Attach the component only to a minimal test object or scene setup.

## What To Observe In The Editor

- Whether the script compiles without adding imports.
- Whether `Component` is recognized automatically.
- Whether plain Java fields such as `int`, `boolean`, and `String` are accepted.
- Whether `start()` is detected and executed.
- Whether components without `repeat()` are accepted.
- Whether comments or folder naming create any parser issues.

## Error Logging Template

For each failed test, record:

- Script name
- Import method used: wrapped class or inner-body format
- Exact editor error message
- Whether the error happens on import, compile, attach, or runtime
- Minimal reproduction steps

## Manual Pass Criteria

A script passes the first validation round when:

- It imports or pastes cleanly.
- It compiles without undocumented engine calls.
- It can be attached as a component.
- It does not require extra imports to be recognized.

The two validation scripts already passed these criteria on 2026-06-27.

## If A Test Fails

1. Stop adding more scripts.
2. Record the exact failure.
3. Compare the failing script against `GameManager.java`.
4. Determine whether the issue is formatting, folder placement, or an editor-side engine expectation.
