0. �������� ������� ��������� 

1. ������ ������� ������������ ���������.
������� 2 ����������;
xdb.jar
xmlparserv2.jar
��������� ��������� ����������.

2. ������� ������������ ���������� SwingSet.jar
������� ����������� ������������ �������� ��� ������� � ����������� ������.
��� ������� ������������ ���������� java.

3. ������� ������ domain � service
�.�. �������� ������ �������� � �������� ��� ����.
�� �������� ������ � ������ ��������������. � ������� ��������� ������������ ������������� ����� TabPanel.
�������� logger JUL.
������� ����� logon. ������ ���� ������������ ��� connect config.xml.
����������� ������� SAX � DOM ��� ���������� ����� ������������.

4. �������� ������ logback, slf4j.
�������������� ���������� ����� ����������:
slf4j
logback-core
logback-classic

5. ���������� ��������� ����� � ������.
���� ������������ �������� �� ��������� �����.
����� logon ���������� ������ ������ ������������. 
������������ ������ �����������, �� ����������������.
���������� ������ TbPanel, TbModel. �� TbModel ������� TbManager.

6. ������� ������� ������ FrameList, FrameEdit, FrameView, FrameLogon
�.�. ���������� ��� ��������� ����������.
��� ����� ������������ �� ���� �������.
��� �����, ���������� �� FrameList ���������� �������� SelectManager.
����� logon ���������� ������ ������ ������������. 
������������ ������ �����������, �� ����������������.

7. ��� ������� ������ ����� ������� ���� ����������� ������ ��������� 
XxxxxManagerList � XxxxxManagerEdit. ����� ������� ���� DataModel ��� ������� 
������ List. �.�. SelectManager ����������� �� ������ XxxxxManagerList, ������ 
����� ����������� �� ��������� ���������. �������� �������� ����������� �
XxxxxManagerEdit.
������ ManagerList � ����������� �� ���� ����� ManagerListStr. 
�� ���� ���������� ��� XxxxxxManagerList.
����� ������� �������� ������� DmXxxxxx. 
������ ������� ����� DmPanel, �� ���� DmListStr. ��� dataModel ���������� �� DmListStr.

8. ������ DmListStr � ManagerListStr, ������� ��������� ������ �� ��������� �������� ������, 
����������� ����������� ��������� � ������ ��� ������� ��������.
�������� ������� ����� Renderer ��� ����������� ��� � ������ � ��������.
�������� ������ ����� �������.
����������� ����������� ��� ���������� ������ ����.
�.�. ��������� ����������� ��������� ������ ������������ ���������� java.
���������� ���������. ��� ������� ID ����������� ������������� �����.
��������� ���� - Hibernate.
