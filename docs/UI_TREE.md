# APICE RPG Framework UI Tree

## HUD

- Top Bar
- Player Status
- Health
- Energy
- Ultimate
- XP
- Level
- Coins
- Region
- Menu
- Inventory Button
- Guardian Button
- Shop Button
- Quest Button
- Map Button
- Settings Button
- Skill Panel
- Player Skill 1
- Player Skill 2
- Player Skill 3
- Player Ultimate
- Guardian Skill 1
- Guardian Skill 2
- Guardian Skill 3
- Guardian Ultimate
- Guardian Card
- Guardian Portrait
- Guardian Name
- Guardian Level
- Guardian HP
- Guardian Energy
- Chat
- Notifications
- Minimap

## Modals

- Inventory Modal
- Guardian Modal
- Shop Modal
- Quest Modal
- Map Modal
- Settings Modal
- Laboratory Modal
- Trade Modal
- Party Modal
- Friends Modal
- Guild Modal

## UI Ownership

- `UIManager` is the root coordinator for HUD visibility and modal transitions.
- Gameplay managers publish intent, while UI rendering remains isolated from core game logic.
- Chat and social panels should be treated as optional overlays that can be disabled in offline mode.
