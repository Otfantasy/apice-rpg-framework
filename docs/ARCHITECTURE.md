# APICE RPG Framework Architecture

## Objective

This repository contains the initial modular structure for the APICE RPG Framework targeting ITsMagic. The current delivery focuses on safe foundations, clear ownership between systems, and low-risk script shells compatible with the `Component` lifecycle.

## Design Principles

- Keep every gameplay script as an isolated `Component`.
- Use `start()` for setup and `repeat()` for frame-by-frame updates.
- Avoid depending on undocumented ITsMagic APIs.
- Document future integrations before implementing them.
- Separate runtime managers from static databases and planning docs.

## Runtime Layers

### Core

- `GameManager`: bootstraps global flow, feature flags, and shared state.
- `EventSystem`: centralizes high-level event dispatch conventions.
- `SaveManager`: owns save/load strategy planning and serialization boundaries.
- `WorldManager`: tracks world-state concerns, regions, and streaming roadmap.

### UI

- `UIManager`: coordinates HUD visibility, modal state, and notification entrypoints.

### Gameplay

- `PlayerManager`: player state, movement hooks, progression references.
- `InventoryManager`: inventory slots, categories, and item transaction rules.
- `GuardianManager`: active guardian state, follow behavior plan, summon lifecycle.
- `CombatManager`: combat state machine, damage flow roadmap, encounter hooks.
- `PlayerSkillManager`: player skill slots, cooldown planning, activation pipeline.
- `GuardianSkillManager`: guardian skill slots, AI trigger planning, support logic.
- `QuestManager`: quest state lifecycle and objective tracking conventions.
- `DialogueManager`: dialogue sessions, branching rules, and presentation handoff.
- `NPCManager`: NPC identity, interaction states, and spawn ownership.
- `ShopManager`: buy/sell interfaces, currency checks, and catalog routing.
- `LaboratoryManager`: guardian crafting and upgrade workflows.
- `DropManager`: drop generation rules and pickup lifecycle planning.

### Online

- `MultiplayerManager`: authoritative online session roadmap and sync boundaries.
- `ChatManager`: text chat channels, moderation hooks, and UI dispatch.
- `VoiceChatManager`: placeholder for future voice provider integration.
- `TradeManager`: future player-to-player trade validation flow.
- `PartyManager`: group creation, invites, and party presence roadmap.
- `FriendsManager`: friend list state and social interaction entrypoints.
- `GuildManager`: guild membership, roles, and shared progression roadmap.

### Databases

- Database scripts currently expose only local bootstrap placeholders.
- Future work should move static definitions into engine-friendly data assets or package-managed resources when the import pipeline is finalized.

## Communication Rules

- Core managers should be the only layer allowed to coordinate cross-system startup.
- Gameplay managers may reference shared flags conceptually, but should avoid hard coupling until an event contract is formalized.
- Online managers should remain optional and degrade gracefully when multiplayer is disabled.
- Database scripts should stay read-only once loaded.

## Safety Notes

- The current scripts intentionally avoid undocumented engine calls.
- Any missing ITsMagic service should be introduced only after validation in the official docs.
- Systems requiring persistence, networking, UI widgets, or entity spawning remain documented as planned work rather than speculative code.
