# Git Practice 🚀

This repository is created for **learning and practicing Git and GitHub** through hands-on examples and real-world scenarios.

## 📚 Topics Covered

* Git basics
* Repository initialization
* `git status`
* `git add`
* `git commit`
* `git log`
* `git diff`
* Branching
* `git switch` / `git checkout`
* Merging
* Merge conflicts
* Rebasing
* Pull & Push
* Remote repositories
* `git fetch` vs `git pull`
* Staging and unstaging changes
* Undoing changes
* Cherry-pick
* Stash
* Tags
* Practical Git workflow

## 🔄 Practical Workflow

```text
Working Directory
       ↓
   git add
       ↓
Staging Area
       ↓
 git commit
       ↓
Local Repository
       ↓
 git push
       ↓
Remote Repository (GitHub)
```

## 🌿 Branching Practice

Example:

```bash
git branch feature-login
git switch feature-login

# Make changes

git add .
git commit -m "Add login feature"

git switch main
git merge feature-login
```

## ⚔️ Merge Conflict Practice

This repository also contains examples for creating and resolving merge conflicts.

Basic process:

```bash
git pull
# Resolve conflicts
git add .
git commit
git push
```

## 🔥 Useful Commands

```bash
git init
git clone <repository-url>

git status
git add .
git commit -m "message"

git branch
git switch <branch>
git merge <branch>

git pull
git fetch
git push

git stash
git log
git diff
```

## 🎯 Goal

The goal of this repository is to build **strong practical Git knowledge** by practicing commands instead of only learning Git theoretically.

---

**Learning → Practicing → Making Mistakes → Resolving → Improving 🚀**

