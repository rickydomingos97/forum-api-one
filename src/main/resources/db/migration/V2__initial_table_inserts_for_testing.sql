insert into perfil (id, nome)
values(1, 'ALUNO');

insert into usuario (id, nome, email, senha, perfil_id)
values(1, 'svetlana', 'sveta@email.com', '$2y$10$3w/9ZkaNihxnQp0f.6KiFOsRU6o282KAkSx1bVemaey5Zr7nhFDtS', 1);

insert into usuario (id, nome, email, senha, perfil_id)
values(2, 'annapetrova', 'annapetrova5@email.com', '$2y$10$cJ0V7.1xWwI4ONgx7JIYEeHjbYMrpfJJftphDrtVafzbSbmr7EsGi', 1);

insert curso (id, nome, categoria)
values(2, 'Spring Boot', 'Programação Back End');