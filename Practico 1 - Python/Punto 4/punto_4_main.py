from Curso import Curso
from Recomendados import Recomendados

curso1 = Curso("imagen", "Pytorch for Deep learning Bootcamp", "$12.99", "Andrei Neagole, Daniel Bourke", "4,6 estrellas")
curso2 = Curso("Imagen", "Java desde cero, nivel experto", "Oferta - 10 dolares", "when pov", "5 estrellas")

recomendados = Recomendados("            Cursos de programacion")
recomendados.agrego_cursos(curso1)
recomendados.agrego_cursos(curso2)

recomendados.muestro_recomendados()
print()


