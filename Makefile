.PHONY: all
all: build

.PHONY: build
build:
	@./gradlew assemble --warning-mode all

.PHONY: check
check:
	@./gradlew check --warning-mode all

.PHONY: run
run:
	@./gradlew :run

.PHONY: test
test:
	@./gradlew test

.PHONY: up
up:
	@docker-compose up -d

.PHONY: docker-run
docker-run:
	@docker exec mowers-controller ./gradlew :run --warning-mode all

.PHONY: docker-test
docker-test:
	@docker exec mowers-controller ./gradlew test --warning-mode all