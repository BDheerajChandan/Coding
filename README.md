==================================================================================================================================================
						Seeting up git with GitHUB using login crecedential
==================================================================================================================================================
git config --global user.name "Your GitHub Username"
git config --global user.email "Your GitHub Email"
git clone <GitHUB repository URL>

==================================================================================================================================================
	In GIT, If you want to create a directory and file using mkdir and touch then you need to connect them with github by "/.gitkeep"
==================================================================================================================================================
mkdir <dir>
touch <dir>/.gitkeep
touch <dir>/<filename>
git status

==================================================================================================================================================
						In GIT, To see log informations and to see command history
==================================================================================================================================================
git log
history
git checkout <commit_hash>
git revert <commit_hash>
