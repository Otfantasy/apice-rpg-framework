# APICE RPG Framework Architecture

## Objective

This repository contains the initial modular structure for the APICE RPG Framework targeting ITsMagic. The current delivery focuses on safe foundations, clear ownership between systems, and low-risk script shells compatible with the `Component` lifecycle.

## Status Boundary

Already present in the repository:

- Directory structure and file ownership by domain.
- Minimal component shells with primitive placeholder state.
- Planning documents for future implementation.

Not implemented yet:

- Runtime communication between managers.
- UI construction.
- Save/load behavior.
- Online synchronization.
- NPC spawning, combat resolution, or content loading.

## Design Principles

- Keep every gameplay script as an isolated `Component`.
- Use `start()` for setup.
- Add `repeat()` only when a component truly needs frame-by-frame logic.
- Avoid depending on undocumented ITsMagic APIs.
- Document future integrations before implementing them.
- Separate runtime managers from static databases and planning docs.

## Runtime Layers

### Core

- `GameManager`: stores bootstrap-level flags and placeholders.
- `EventSystem`: stores placeholder event state only.
- `SaveManager`: stores save-system readiness placeholders only.
- `WorldManager`: stores placeholder region state only.

### UI

- `UIManager`: stores placeholder HUD and modal state only.

### Gameplay

- `PlayerManager`: placeholder player level and health state.
- `InventoryManager`: placeholder inventory counters.
- `GuardianManager`: placeholder equipped-guardian state.
- `CombatManager`: placeholder combat flags.
- `PlayerSkillManager`: placeholder player skill slot state.
- `GuardianSkillManager`: placeholder guardian skill slot state.
- `QuestManager`: placeholder quest counters and tracking state.
- `DialogueManager`: placeholder dialogue open/closed state.
- `NPCManager`: placeholder NPC counters and focus state.
- `ShopManager`: placeholder shop open/closed state.
- `LaboratoryManager`: placeholder crafting queue state.
- `DropManager`: placeholder drop counters only.

### Online

- `MultiplayerManager`: placeholder online-mode flags only.
- `ChatManager`: placeholder chat visibility and unread counters.
- `VoiceChatManager`: placeholder voice capability flags only.
- `TradeManager`: placeholder trade-session state.
- `PartyManager`: placeholder party counters only.
- `FriendsManager`: placeholder friend counters only.
- `GuildManager`: placeholder guild membership state only.

### Databases

- Database scripts currently expose only local bootstrap placeholders.
- Future work should move static definitions into engine-friendly data assets or package-managed resources when the import pipeline is finalized.

## Communication Rules

- These are target architecture rules, not code already implemented.
- Core managers should be the only layer allowed to coordinate cross-system startup.
- Gameplay managers should avoid hard coupling until an event contract is formalized.
- Online managers should remain optional when multiplayer is disabled.
- Database scripts should stay read-only once real loading is added.

## Safety Notes

- The current scripts intentionally avoid undocumented engine calls.
- Any missing ITsMagic service should be introduced only after validation in the official docs.
- Systems requiring persistence, networking, UI widgets, or entity spawning remain documented as planned work rather than speculative code.
