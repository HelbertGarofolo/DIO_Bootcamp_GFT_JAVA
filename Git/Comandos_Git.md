# Alguns comandos GIT

- ### Criar repositório

  mkdir <nome-do-repositorio>

- ### Iniciar repositório

  git init

- ### Iniciar versionamento e mover arquivos para o branch

  git add * ou git add . ou git add -a

- ### Criar Commit (congela o contexto --> tipo Snap Shot)

  git commit -m "Comentário do commiti"

- ### Monitorar Status dos arquivos

  git status

- ### Mover arquivos

  mv <nome-do-arquivo> ./<nome-do-repositorio>

- ### Criar arquivo

  echo> <nome-do-arquivo+extensao> ex: (echo> README.md)

- ### Apontar repositório local para origem remota

  - ##### Criar Origem

    git remote add origin <Link criado no repositório do GitHub>

  - ##### Ver Links das lostas de repositório remoto cadastradas

    git remote -v

  - ##### Empurrar arquivos para origem REMOTA (Servidor GitHub)

    git push origem master (ou main dependendo da criação)

  - ##### Puxar arquivos origem REMOTO para LOCAL(máquina pessoal)

  - git pull origem master

- ### Lista de Configurações

  git config --list 	(mostrar todas as configurações do Git)

  git config  --global 	(Seta as configurações de modo Global)

  git config  --global --unset 	(Apaga configuração) EX: (git config  --global --unset user.email)

  git config  --global user.email "e-mail" (Cria configuração de e-mail)

- ### Clonar repositório GitHub--> de REMOTO para LOCAL

  git clone < colocar endereço dentro de <> >