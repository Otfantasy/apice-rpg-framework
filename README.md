# APICE RPG Framework for ITsMagic

APICE RPG Framework is the initial foundation for an open-world RPG structure intended for future multiplayer expansion in ITsMagic. This first delivery intentionally prioritizes organization, lifecycle-safe script shells, and planning documents over complex implementation.

## Current repository status

What already exists:

- Folder structure for core, UI, gameplay, online, and database areas.
- Minimal Java component shells that initialize placeholder state in `start()`.
- Planning documents for architecture, roadmap, import flow, and validation.
- A non-official manifest example for future package discussion.

What does not exist yet:

- No gameplay loop implementation.
- No UI rendering implementation.
- No save system, networking, combat, spawning, or database loading logic.
- No confirmed package-manager schema for ITsMagic distribution.

## What is included

- `docs/`: architecture, gameplay, UI, multiplayer, import, and roadmap planning.
- `scripts/core/`: bootstrap-level managers for game flow, events, save strategy, and world ownership.
- `scripts/ui/`: UI coordination entrypoint.
- `scripts/gameplay/`: gameplay manager placeholders for player, guardians, combat, quests, shops, and related systems.
- `scripts/online/`: multiplayer and social system placeholders.
- `scripts/database/`: static data ownership placeholders.
- `package-manifest-example.json`: starter example for future package distribution.

## ITsMagic compatibility notes

This repository currently follows these validated constraints:

- Every external repository script is written as `class Name extends Component`.
- Initialization is placed in `start()`.
- `repeat()` is omitted unless real frame-update logic exists.
- No engine imports are declared.
- No undocumented ITsMagic API is called.

See [docs/ITSMAGIC_SCRIPT_FORMAT.md](/C:/Users/claud/Documents/JOGO/docs/ITSMAGIC_SCRIPT_FORMAT.md) for the distinction between repository files and code pasted directly into the ITsMagic editor.

Official references used during this setup:

- [ITsMagic documentation](https://itsmagic.com.br/documentation/docs/intro/)
- [ITsMagic Documentation repository](https://github.com/ITsMagic-Software/Documentation)

## Why the scripts are simple

The current goal is to establish a safe modular base. Systems such as spawning, persistence, networking, UI widget rendering, and voice integration were not hard-coded because those APIs must be validated in the official ITsMagic documentation before implementation.

Where the engine integration is still unknown, the code uses only primitive fields plus `start()` initialization, and the docs explain the intended future direction.

## Manifest status

`package-manifest-example.json` is only a draft example stored in the repository. It is not an official ITsMagic Marketplace package, does not claim a validated marketplace schema, and should be treated as planning metadata until the package specification is confirmed.

## Suggested next steps

1. Import the scripts into an ITsMagic project and validate compilation.
2. Follow [docs/VALIDATION_CHECKLIST.md](/C:/Users/claud/Documents/JOGO/docs/VALIDATION_CHECKLIST.md) for the first engine-side review pass.
3. Confirm the preferred script format in the ITsMagic editor versus external `.java` files.
4. Only after validation, start a small local gameplay slice with `GameManager`, `UIManager`, `PlayerManager`, and `GuardianManager`.
