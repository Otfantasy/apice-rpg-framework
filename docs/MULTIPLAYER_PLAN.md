# Multiplayer Plan

## Goal

Prepare APICE RPG Framework for multiplayer expansion without forcing early coupling into offline-first systems.

## Phase 1

- Keep offline-safe manager stubs in place.
- Define which managers require synchronization later.
- Separate local state from future replicated state in documentation.

## Phase 2

- Validate available ITsMagic networking primitives.
- Define authoritative responsibilities for player movement, combat, and chat.
- Decide how guardian companions are replicated.

## Phase 3

- Introduce text chat channels.
- Add social systems for party, friends, and guilds.
- Prepare trade validation rules and anti-duplication safeguards.

## Phase 4

- Evaluate voice chat provider strategy outside the engine core.
- Add reconnect behavior, session recovery, and moderation tooling.

## Sync Priorities

- Player transform and action state
- Guardian presence and combat state
- Quest progression boundaries
- Loot ownership
- Chat messages
- Group membership

## Risks

- Premature coupling between local gameplay logic and online authority.
- Unsupported assumptions about ITsMagic networking services.
- Save data conflicts between offline and online progression.
