# Changelog / 변경 내역

Release history for **ReciPrime** (formerly Sulfur Gunpowder). For downloadable builds, see [GitHub Releases](https://github.com/zzong-mee/ReciPrime/releases).

**ReciPrime**(구 Sulfur Gunpowder)의 버전별 변경 내역입니다. 배포 파일은 [GitHub Releases](https://github.com/zzong-mee/ReciPrime/releases)에서 다운로드할 수 있습니다.

## v2.0.0 — From Vanilla to Prime

### Added / 추가

- Added seven crafting recipes for six vanilla items.
- Added Ghast Tear crafting in two orientations.
- Added Crying Obsidian crafting.
- Added Elytra crafting.
- Added an alternative Gunpowder crafting recipe.
- Restored Enchanted Golden Apple crafting.
- Added Totem of Undying crafting.
- Added recipe book unlocks for all new recipes.
- Added glass bottle return support for Ghast Tear crafting.
- Added Crafter compatibility for Ghast Tear crafting.
- 바닐라 아이템 6종에 대한 조합법 7개를 추가했습니다.
- 가스트 눈물의 두 가지 방향 조합법을 추가했습니다.
- 우는 흑요석 조합법을 추가했습니다.
- 겉날개 조합법을 추가했습니다.
- 화약 대체 조합법을 추가했습니다.
- 마법이 부여된 황금 사과 조합법을 복원했습니다.
- 불사의 토템 조합법을 추가했습니다.
- 모든 신규 조합법의 레시피북 해금을 지원합니다.
- 가스트 눈물 제작 시 유리병 반환 기능을 추가했습니다.
- 가스트 눈물 제작의 자동 제작기 호환성을 구현했습니다.

### Changed / 변경

- Rebranded Sulfur Gunpowder to ReciPrime.
- Changed the mod ID to `reciprime`.
- Updated the Java package and resource namespace.
- Updated the logo, icon, slogan, and documentation.
- Shifted development toward vanilla-only crafting recipes.
- Standardized repository line endings.
- Sulfur Gunpowder를 ReciPrime으로 리브랜딩했습니다.
- 모드 ID를 `reciprime`으로 변경했습니다.
- Java 패키지 및 리소스 네임스페이스를 변경했습니다.
- 로고, 아이콘, 슬로건 및 문서를 갱신했습니다.
- 바닐라 아이템 중심의 조합법 모드로 개발 방향을 변경했습니다.
- 저장소의 줄바꿈 형식을 표준화했습니다.

### Fixed / 수정

- Ensured that both Ghast Tear recipe orientations are unlocked.
- Unified crafting remainder handling for crafting tables and Crafters.
- Preserved existing crafting remainders to avoid duplicate bottle returns.
- 가스트 눈물의 두 가지 조합법이 모두 해금되도록 수정했습니다.
- 일반 제작대와 자동 제작기의 제작 잔여물 처리 로직을 통합했습니다.
- 기존 제작 잔여물을 유지하여 유리병 중복 반환을 방지했습니다.

### Removed / 제거

- Removed Sulfur Powder and Nether Quartz Powder.
- Removed custom item textures, translations, and creative inventory tab.
- Removed additional Nether quartz ore drops.
- Removed previous custom recipes and their recipe unlock conditions.
- 유황 가루와 네더 석영 가루를 제거했습니다.
- 커스텀 아이템 텍스처, 번역 및 전용 크리에이티브 탭을 제거했습니다.
- 네더 석영 광석의 추가 드롭을 제거했습니다.
- 기존 커스텀 조합법 및 레시피북 해금 조건을 제거했습니다.

### Breaking changes / 호환성 변경

- Changed the mod ID from `sulfur_gunpowder` to `reciprime`.
- Previous custom items are no longer available.
- No automatic migration is provided. Back up existing worlds before upgrading.
- 모드 ID가 `sulfur_gunpowder`에서 `reciprime`으로 변경되었습니다.
- 이전 버전의 커스텀 아이템은 더 이상 사용할 수 없습니다.
- 자동 마이그레이션을 지원하지 않습니다. 업데이트 전 기존 월드를 백업하세요.

### Testing / 테스트

- Local build and single-player regression testing completed.
- Dedicated server and multiplayer compatibility have not been verified.
- 로컬 빌드 및 싱글플레이 회귀 테스트를 완료했습니다.
- 전용 서버 및 멀티플레이 호환성은 검증하지 않았습니다.

## [v1.0.0](https://github.com/zzong-mee/ReciPrime/releases/tag/v1.0.0) — First stable release / 첫 정식 출시

- First stable release, based on the tested v0.4.1 features.
- Updated project version and documentation; no new gameplay mechanics in this release.
- v0.4.1의 기능을 기반으로 최초 정식 버전을 출시했습니다.
- 프로젝트 버전 및 문서를 갱신했으며 새 게임 기능은 추가하지 않았습니다.

## [v0.4.1](https://github.com/zzong-mee/ReciPrime/releases/tag/v0.4.1) — Loader compatibility / 로더 호환성

- Lowered minimum Fabric Loader requirement to **0.19.5**.
- Added GitHub Actions build and draft-release automation, and improved Gradle wrapper portability.
- Fabric Loader 최소 요구 버전을 **0.19.5**로 변경했습니다.
- GitHub Actions 자동 빌드·릴리스 초안 생성 및 Gradle 실행 스크립트 호환성을 개선했습니다.

## [v0.4.0](https://github.com/zzong-mee/ReciPrime/releases/tag/v0.4.0) — Nether Quartz Powder / 네더 석영 가루

- Added Nether Quartz Powder and a custom 16×16 texture.
- Added Nether quartz ore mining rewards, Fortune support, and Silk Touch exclusion.
- Updated Korean and English text and added screenshots.
- 네더 석영 가루 및 16×16 텍스처를 추가했습니다.
- 네더 석영 광석 채굴 보상, 행운 지원, 섬세한 손길 예외 처리를 구현했습니다.
- 한·영 번역과 스크린샷을 보완했습니다.

## [v0.3.0](https://github.com/zzong-mee/ReciPrime/releases/tag/v0.3.0) — Gunpowder crafting / 화약 조합

- Added a shapeless vanilla gunpowder crafting recipe and recipe book unlock.
- 바닐라 화약의 비정형 조합법 및 레시피북 해금 조건을 추가했습니다.

## [v0.2.0](https://github.com/zzong-mee/ReciPrime/releases/tag/v0.2.0) — Creative inventory / 크리에이티브 탭

- Added a dedicated creative inventory tab and refined Korean item naming to **유황 가루**.
- 전용 크리에이티브 탭을 추가하고 아이템 한국어 이름을 **유황 가루**로 수정했습니다.

## [v0.1.0](https://github.com/zzong-mee/ReciPrime/releases/tag/v0.1.0) — Initial release / 최초 개발 버전

- Added Sulfur Powder, sulfur block unpacking, custom pixel texture, and Korean/English localization.
- 유황 가루, 유황 블록 분해 조합법, 전용 픽셀 텍스처, 한국어·영어 번역을 추가했습니다.
