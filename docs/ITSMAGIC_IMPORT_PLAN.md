# ITsMagic Import Plan

## Confirmed Constraints

- Scripts should extend `Component`.
- `start()` is used for initialization.
- `repeat()` is used for update flow.
- Engine-specific imports are not required in the ITsMagic ecosystem.

Documentation consulted:

- [ITsMagic docs](https://itsmagic.com.br/documentation/docs/intro/)
- [ITsMagic documentation repository](https://github.com/ITsMagic-Software/Documentation)

## Initial Import Strategy

1. Create or copy the `scripts/` tree into the ITsMagic project script area.
2. Keep one manager per file to simplify maintenance.
3. Attach only the truly necessary manager components to starter objects during early tests.
4. Validate lifecycle behavior in-engine before introducing shared references.

## Recommended First Import Order

1. `scripts/core/GameManager.java`
2. `scripts/ui/UIManager.java`
3. `scripts/gameplay/PlayerManager.java`
4. `scripts/gameplay/GuardianManager.java`
5. Remaining managers
6. Database placeholders

## Manual Validation Checklist

- Verify each script compiles in ITsMagic without extra imports.
- Confirm `start()` executes on scene/object initialization.
- Confirm `repeat()` executes during runtime updates.
- Confirm comments and placeholder fields do not trigger parser issues.

## Package Manager Future Plan

- Replace ad hoc copying with a versioned package layout.
- Move docs and manifest data into package-friendly metadata.
- Publish a minimal stable package only after import conventions are validated.

## Safe Stub Policy

- If a required engine feature is not documented, leave it as a comment or placeholder field.
- Do not fake object lookup, scene loading, networking, or save APIs until officially confirmed.
