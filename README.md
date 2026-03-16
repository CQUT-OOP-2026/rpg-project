# 🎮英雄大陆 · RPG游戏项目模板
## 《面向对象程序设计（Java）》课程项目

欢迎来到英雄大陆！这是一个贯穿整个学期的 RPG 游戏开发项目，你将通过完成一系列循序渐进的里程碑任务，掌握 Java 面向对象编程的核心思想，并最终构建出一个完整的角色扮演游戏系统。

# 📁 仓库结构
本模板仓库按周次（里程碑）组织，每个文件夹对应一个独立的任务，内含该任务所需的脚手架代码（如类框架、方法签名等）。你需要在**自己的作业仓库**中依次完成这些任务。  

rpg-project-starter/  
├── milestone01-HelloHero/          # 第1周：第一个程序  
│   └── HelloHero.java               # 输出英雄诞生  
├── milestone02-RoleAttributes/      # 第2周：角色属性面板  
│   └── RoleAttributes.java          # 变量、数据类型练习  
├── milestone03-BattleFlow/          # 第3周：战斗分支与循环  
│   └── Battle.java                  # if-else、for 循环  
├── milestone04-Inventory/           # 第4周：背包系统（数组）  
│   └── Inventory.java               # 数组管理物品  
├── milestone05-RoleClass/           # 第5周：类与对象  
│   └── Role.java                    # 封装角色属性与方法  
├── milestone06-Inheritance/         # 第6周：继承与多态  
│   └── Warrior, Mage                 # 职业继承体系  
├── milestone07-AbstractInterface/   # 第7周：抽象类与接口  
│   └── QuestSystem                   # 任务系统设计  
├── milestone08-Composition/         # 第8周：组合与装备  
│   └── Weapon, Equipment             # 装备系统  
├── milestone09-Exception/           # 第9周：异常处理  
│   └── ExceptionDemo                 # 自定义异常  
├── milestone10-JavaLib/             # 第10周：基础类库  
│   └── StringMath                    # 字符串、数学工具  
├── milestone11-GUI/                 # 第11周：图形界面  
│   └── GameWindow                    # Swing 基础  
├── milestone12-FileIO/              # 第12周：文件输入输出  
│   └── SaveLoad                      # 存档功能  
├── milestone13-Integration/         # 第13周：项目整合  
│   └── MainGame                      # 整合所有模块  
└── README.md                         # 本文件  

# 🚀 如何使用
## 1. 接受作业
每周老师会在超星平台发布新的作业链接（GitHub Classroom 邀请）。

点击链接，接受作业，系统会自动为你创建一个个人专属的作业仓库（例如 rpg-project-你的用户名）。

该仓库最初会包含本模板仓库的全部内容（即上述文件夹结构）。

## 2. 克隆到本地
打开 IntelliJ IDEA，选择 Get from VCS，输入你的作业仓库地址，将项目克隆到本地。

## 3. 完成本周任务
进入对应的里程碑文件夹，打开提供的脚手架代码文件。

根据任务要求（详见每周超星发布的作业说明）编写代码。

注意：请在你自己的作业仓库中直接修改文件，不要在本模板仓库中操作。

## 4. 提交代码
完成编码后，使用 Git 提交更改并推送到远程仓库：
git add .
git commit -m "完成里程碑XX：XXX功能"
git push

你也可以直接在 IDEA 中使用 Commit 和 Push 按钮。

## 5. 获取后续任务
当老师发布新的里程碑时，会更新本模板仓库。

你可以在自己的作业仓库中通过 Sync assignments 功能拉取更新（详见下文）。

# 🔄 如何同步老师的更新
如果老师在本模板仓库中添加了新内容（如新的里程碑文件夹），你可以在自己的作业仓库中通过以下方式获取更新：

## 方法一：在 GitHub 网页端操作
进入你的作业仓库（例如 https://github.com/你的组织/rpg-project-你的用户名）。

点击 Pull requests 标签页。

如果老师已触发同步，你会看到一个自动生成的 Pull Request，标题类似于 “Sync assignments from template”。

点击该 PR，检查变更内容（通常是新增的文件夹），然后点击 Merge pull request 即可合并更新。

合并后，在本地执行 git pull 拉取最新代码。

## 方法二：在 IDEA 中操作
在 IDEA 中打开你的项目。

执行 git fetch origin 获取远程更新。

如果有新增的分支或 PR，你可以通过 Git → Pull 拉取变更（需要提前将 PR 合并到主分支）。

## ✅ 评分标准
每个里程碑作业将根据以下维度评分（满分 100 分）：

功能实现（40分）：程序正确编译运行，输出符合要求。

代码质量（40分）：命名规范、注释清晰、结构合理。

提交完整性（20分）：成功推送代码，提交信息明确。

部分里程碑会启用 GitHub Classroom 的自动评分功能，每次推送后你可以在仓库页面直接看到测试结果。

## ❓ 常见问题
**Q1：我可以在本地修改文件夹结构吗？**
A：可以，但建议保持原有结构，便于老师和助教评审。如果你需要添加自己的文件（如测试类），请放在对应里程碑文件夹内。

**Q2：如何查看自己是否成功提交？**
A：登录 GitHub，进入你的作业仓库，确认代码已更新且提交历史中有你的推送记录。

**Q3：如果我想提前完成后续任务怎么办？**
A：你可以自行在本地创建新文件，但请注意后续老师可能会更新脚手架代码。建议等老师发布任务后再开始。

**Q4：遇到 Git 操作问题怎么办？**
A：先查阅课程提供的《GitHub 与 IDEA 环境搭建指南》，或在课程讨论区提问。

## 📞 联系与支持
课程超星平台讨论区

邮箱：catherinelj@163.com

AI 教学助手：超星平台AI助教、智谱清言智能体（24小时答疑）

**现在，开启你的英雄之旅吧！ 🛡️⚔️**
