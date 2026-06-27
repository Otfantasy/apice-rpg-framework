# Gameplay Systems Overview

## Current Scope

This first delivery defines the system boundaries for the APICE RPG Framework without implementing complex mechanics.

## Core Gameplay Domains

- Player progression
- Guardian companionship
- Skill usage
- Inventory and item handling
- Shops and currencies
- NPC interactions
- Dialogues
- Quests
- Combat and damage flow
- Loot drops
- Laboratory crafting and upgrades

## Planned System Contracts

### Player

- Holds player progression, current status, and local action state.
- Delegates inventory, skills, quests, and guardian control to dedicated managers.

### Guardian

- Supports one equipped guardian at a time in the initial architecture.
- Future lab systems produce guardians through fragments, materials, and coins.

### Combat

- Must support player, guardian, and enemy interactions.
- PvP is intentionally postponed to a later roadmap phase.

### Economy

- Inventory, drops, shops, and recipes should share a common item identity model.
- Currency handling should stay centralized to avoid duplication.

### Narrative

- NPC and dialogue systems should feed quest progression safely.
- Dialogue branching should be data-driven once content pipelines are defined.

## Deferred Features

- PvP
- Dungeons
- Housing
- Mounts
- Seasonal systems
- Internal marketplace
- Advanced crafting
- Ranking
