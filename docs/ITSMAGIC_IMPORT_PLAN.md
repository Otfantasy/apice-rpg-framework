# ITsMagic Import Plan

## Confirmed Constraints

- Scripts should extend `Component`.
- `start()` is used for initialization.
- `repeat()` is available for update flow, but should be added only when needed.
- Engine-specific imports are not required in the ITsMagic ecosystem.

## Repository Format vs Editor Format

- Repository files in this project use explicit declarations such as `class GameManager extends Component { ... }`.
- For code pasted directly into the ITsMagic editor, the engine may auto-wrap the script as a component depending on the workflow described in the task context.
- Because that distinction affects copy/paste behavior, this repository now documents both formats in [ITSMAGIC_SCRIPT_FORMAT.md](/C:/Users/claud/Documents/JOGO/docs/ITSMAGIC_SCRIPT_FORMAT.md).

Documentation consulted:

- [ITsMagic docs](https://itsmagic.com.br/documentation/docs/intro/)
- [ITsMagic documentation repository](https://github.com/ITsMagic-Software/Documentation)

## Initial Import Strategy

1. Create or copy the `scripts/` tree into the ITsMagic project script area.
2. Keep one manager per file to simplify maintenance.
3. Attach only the truly necessary manager components to starter objects during early tests.
4. Validate lifecycle behavior in-engine before introducing shared references.
5. If the editor expects pasted snippets without a class wrapper, convert from the repository format using the guide in `docs/ITSMAGIC_SCRIPT_FORMAT.md`.

## Recommended First Import Order

1. `scripts/core/GameManager.java`
2. `scripts/ui/UIManager.java`
3. `scripts/gameplay/PlayerManager.java`
4. `scripts/gameplay/GuardianManager.java`
5. `scripts/gameplay/InventoryManager.java`
6. Remaining placeholder managers
7. Database placeholders

## Manual Validation Checklist

- Verify each script compiles in ITsMagic without extra imports.
- Confirm `start()` executes on scene/object initialization.
- Confirm components without `repeat()` remain valid.
- Confirm comments and placeholder fields do not trigger parser issues.

## Package Manager Future Plan

- Replace ad hoc copying with a versioned package layout.
- Move docs and manifest data into package-friendly metadata.
- Publish a minimal stable package only after import conventions are validated.

## What This Plan Does Not Claim

- It does not claim that the current repository is already import-validated inside ITsMagic.
- It does not claim that `package-manifest-example.json` matches an official marketplace schema.
- It does not claim that multiplayer, UI, save, or data loading systems are already operational.

## Safe Stub Policy

- If a required engine feature is not documented, leave it as a comment or placeholder field.
- Do not fake object lookup, scene loading, networking, or save APIs until officially confirmed.
