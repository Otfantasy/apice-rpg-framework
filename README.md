# APICE RPG Framework for ITsMagic

APICE RPG Framework is the initial foundation for an open-world multiplayer RPG structure built for ITsMagic. This first delivery intentionally prioritizes organization, lifecycle-safe script shells, and planning documents over complex implementation.

## What is included

- `docs/`: architecture, gameplay, UI, multiplayer, import, and roadmap planning.
- `scripts/core/`: bootstrap-level managers for game flow, events, save strategy, and world ownership.
- `scripts/ui/`: UI coordination entrypoint.
- `scripts/gameplay/`: gameplay manager placeholders for player, guardians, combat, quests, shops, and related systems.
- `scripts/online/`: multiplayer and social system placeholders.
- `scripts/database/`: static data ownership placeholders.
- `package-manifest-example.json`: starter example for future package distribution.

## ITsMagic compatibility notes

This repository follows the constraints described in the task:

- Every script extends `Component`.
- Initialization is placed in `start()`.
- Frame updates are placed in `repeat()`.
- No engine imports are declared.
- No undocumented ITsMagic API is called.

Official references used during this setup:

- [ITsMagic documentation](https://itsmagic.com.br/documentation/docs/intro/)
- [ITsMagic Documentation repository](https://github.com/ITsMagic-Software/Documentation)

## Why the scripts are simple

The current goal is to establish a safe modular base. Systems such as spawning, persistence, networking, UI widget rendering, and voice integration were not hard-coded because those APIs must be validated in the official ITsMagic documentation before implementation.

Where the engine integration is still unknown, the code uses safe placeholders and the docs explain the intended future direction.

## Suggested next steps

1. Import the scripts into an ITsMagic project and validate compilation.
2. Confirm how managers should communicate in-engine.
3. Prototype a small local gameplay slice with `GameManager`, `UIManager`, `PlayerManager`, and `GuardianManager`.
4. Expand data definitions before adding online synchronization.
