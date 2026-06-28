# UIManager v1

## Scope

`UIManager` is the first real functional system in the APICE RPG Framework. Version 1 does not render visual HUD elements yet. Instead, it provides safe internal state management for HUD visibility, modal control, and notifications.

## What UIManager v1 Already Does

- Tracks whether the HUD should be visible.
- Tracks whether a modal is open.
- Stores the current modal name.
- Ensures only one modal is open at a time.
- Rejects empty or null modal names.
- Stores the last notification message.
- Allows notifications to be cleared without any rendering dependency.

Implemented methods:

- `start()`
- `openModal(String modalName)`
- `closeModal()`
- `closeAllModals()`
- `isModalOpen()`
- `getCurrentModal()`
- `showHUD()`
- `hideHUD()`
- `isHUDVisible()`
- `showNotification(String message)`
- `clearNotifications()`
- `getLastNotification()`

## What UIManager v1 Does Not Do Yet

- No visual HUD drawing
- No button rendering
- No clickable modal windows
- No animation
- No input handling
- No integration with inventory, guardian, combat, or quest systems
- No object lookup or scene wiring through ITsMagic APIs

## Manual Test In ITsMagic

Recommended manual test flow:

1. Attach `UIManager.java` to a test object.
2. Confirm the script compiles with the external class format.
3. Confirm `start()` runs without errors.
4. Use `scripts/validation/UIManagerValidation.java` as an isolated rule-check script if direct component-to-component references are still not standardized in the project.
5. If the editor exposes component fields, inspect values such as `hudVisible`, `currentModal`, `modalOpen`, and `lastNotification` after controlled test calls.

## Why The Validation Script Is Isolated

The repository still avoids assuming a final component lookup or cross-object communication pattern in ITsMagic. Because of that, `UIManagerValidation.java` mirrors the expected call flow without depending on undocumented object-reference APIs.

## Future Calls From Other Managers

These methods are designed to be called by other systems later:

- `openModal(String modalName)`
- `closeModal()`
- `closeAllModals()`
- `showHUD()`
- `hideHUD()`
- `showNotification(String message)`
- `clearNotifications()`

Likely future callers:

- `InventoryManager`
- `GuardianManager`
- `QuestManager`
- `ShopManager`
- `DialogueManager`

## Planned Expansion

Future UIManager versions should expand this logic into:

- Real HUD rendering
- Modal-specific visual layouts
- Button state handling
- Notification queueing
- Minimap, top bar, and skill panel integration
- Integration with ITsMagic visual APIs only after those APIs are confirmed in documentation and tested in-engine
