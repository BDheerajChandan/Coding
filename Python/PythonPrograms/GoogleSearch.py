from googlesearch import search
def GSearch():
    query="What is a Palindrome number"
    URLs=""
    for url in search(query):
        URLs=URLs+url+"\n"
    return (URLs)
print(type(GSearch()))
print(GSearch())